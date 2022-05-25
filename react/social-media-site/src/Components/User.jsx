import React from "react";

const User = ({ user }) => {
  console.log(user);
  return (
    <div className="user">
      <img src={user.picture} alt="avatar" />
      <div className="name">
        <h6>
          {user.firstName} {user.lastName}
        </h6>
      </div>
    </div>
  );
};

export default User;
