import React, { useEffect, useState } from "react";
import axios from "axios";
const API_KEY = "628da197616612aa51a596a1";
let userId = "60d0fe4f5311236168a10a2c";

export default function CurrentUser() {
  // const [allUsers, setAllUsers] = useState([]);
  const [currentUser, setCurrentUser] = useState([]);

  const getUser = async () => {
    const res = await axios.get(`https://dummyapi.io/data/v1/user/${userId}`, {
      headers: {
        "app-id": API_KEY,
      },
    });
    setCurrentUser(res.data);
  };

  useEffect(() => {
    getUser();
  }, []);

  let name = currentUser.firstName + " " + currentUser.lastName;
  // console.log(currentUser);

  return (
    <div>
      <div className=" ui container" style={{ marginTop: 20 }}>
        <div>
          <div className="ui items">
            <div className="item">
              <a className="ui small image">
                <img src={currentUser.picture} alt="user avatar" />
              </a>
              <div className="content aligned center">
                <a className="header">{name}</a>
                <div className="content">
                  <ul className="content">
                    <li> Gender: {currentUser.gender}</li>
                    <li> Birthdate: {currentUser.dateOfBirth} </li>
                    {/* Accessing the location properties below will break the program on reload */}
                    {/* <li> City: {currentUser.location.city} </li> */}
                    {/* <li> State: {currentUser.location.state} </li> */}
                    {/* <li> Country: {currentUser.location.country} </li> */}
                  </ul>
                  <p>This is you! Welcome to the App!</p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
