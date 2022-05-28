import React, { useEffect, useState } from "react";
import axios from "axios";
const API_KEY = "628da197616612aa51a596a1";

export default function CurrentUser() {
  const [allUsers, setAllUsers] = useState([]);
  const [currentUser, setCurrentUser] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/user/", {
        headers: {
          "app-id": API_KEY,
        },
      })
      .then((res) => {
        console.log(res.data.data);
      });
  }, []);

  return <div></div>;
}
