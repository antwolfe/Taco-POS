import React, { useEffect, useState } from "react";

const axios = require("axios");
const API_KEY = "628da197616612aa51a596a1";

function UserList() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/user", {
        headers: {
          "app-id": API_KEY,
        },
      })
      .then((dataArray) => {
        setUsers(dataArray.data.data);
      });
  }, []);

  let userList = users.map((user) => {
    {
      return user;
    }
  });

  return console.log(userList);
}

export default UserList;
