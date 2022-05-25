import React, { useEffect, useState } from "react";

const axios = require("axios");
const API_KEY = "628da197616612aa51a596a1";

const UserList = () => {
  // Get info from API

  const [users, setUsers] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/user", {
        headers: {
          "app-id": API_KEY,
        },
      })
      .then((dataArray) => {
        console.log(setUsers(dataArray.data.data));
      })
      .catch((err) => {
        console.log("failure");
      });
  }, []);

  return console.log({ users });
};

export default UserList;

// returns three values in console ??
