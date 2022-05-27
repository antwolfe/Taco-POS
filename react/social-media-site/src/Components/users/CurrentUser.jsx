import React, { useEffect, useState } from "react";
import axios from "axios";

export default function CurrentUser() {
  const [allUsers, setAllUsers] = useState([]);
  const [currentUser, setCurrentUser] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/user/", {
        headers: {
          "app-id": "628da197616612aa51a596a1",
        },
      })
      .then((res) => {
        console.log(res.data.data);
      });
  }, []);

  return <div></div>;
}
