import React, {useState, useEffect} from 'react';

const UserProfile = () => {
    const [userInfo, setUserInfo] = useState({name:'', email:''});

    useEffect(() => {
        const getUserData = async () => {
            const response = await fetch("http://localhost:8080/user");
            const data = await response.json();

            setUserInfo({
                name: data.name,
                email: data.email,
            });
            console.log(data.name);
            console.log(data.email);

        };
        
        getUserData();
    }, []);

    return (
        <header id="header">
        <div className="inner">
          <a href="#" className="image avatar"><img src="images/avatar.jpg" alt="" /></a>
          <h1>
            <strong>{userInfo.name}</strong>, a super simple<br />
            {userInfo.email}<br />
            crafted by <a href="http://html5up.net">HTML5 UP</a>.
          </h1>
        </div>
      </header>
    );
};

export default UserProfile;