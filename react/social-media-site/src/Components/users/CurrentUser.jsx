import React, { useEffect, useState } from "react";
import axios from "axios";
const API_KEY = "628da197616612aa51a596a1";
let userId = "60d0fe4f5311236168a10a2c";

export default function CurrentUser() {
  // const [allUsers, setAllUsers] = useState([]);
  const [currentUser, setCurrentUser] = useState([]);

  useEffect(() => {
    axios
      .get(`https://dummyapi.io/data/v1/user/${userId}`, {
        headers: {
          "app-id": API_KEY,
        },
      })
      .then((res) => {
        console.log(res.data);
        console.log(res.data.location);
        setCurrentUser(res.data);
      });
  }, []);

  let name = currentUser.firstName + " " + currentUser.lastName;
  // console.log(currentUser.location.city);
  // let state = currentUser.location.state;
  // let country = currentUser.location.country;

  return (
    <div>
      <div className="container">
        <div className="ui">
          <div className="ui items">
            <div className="item">
              <a className="ui small image">
                <img src={currentUser.picture} alt="user avatar" />
              </a>
              <div className="content aligned center">
                <a className="header">{name}</a>
                <div className="description">
                  <ul>
                    <li> Gender: {currentUser.gender}</li>
                    <li> {currentUser.dateOfBirth} </li>
                    <li>{/* {city}, {state}, and {country}` */}</li>
                  </ul>
                  <ul>
                    Many people also have their own barometers for what makes a
                    cute dog.
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
