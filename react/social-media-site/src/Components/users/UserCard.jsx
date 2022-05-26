import React from "react";

const User = ({ name, picture, id, gender }) => {
  return (
    <div className="ui card">
      <div className="image">
        <img src={picture} alt="avatar" />
      </div>
      <div className="content center aligned">
        <h3>{name}</h3>
        <div className="info">
          {/* <p>born {birthdate}</p> */}
          <p>prefers {gender}</p>
        </div>
      </div>
    </div>
  );
};

export default User;
