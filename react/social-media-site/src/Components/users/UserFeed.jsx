import { useEffect, useState } from "react";
import User from "./UserCard";

const axios = require("axios");
const API_KEY = "628da197616612aa51a596a1";

export default function UserList() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/user", {
        headers: {
          "app-id": API_KEY,
        },
      })
      .then((res) => {
        console.log(res.data.data);
        setUsers(res.data.data);
      });
  }, []);

  let userList = users.map((user) => {
    return (
      <User
        name={user.firstName + " " + user.lastName}
        picture={user.picture}
        id={user.id}
        gender={user.title}
      />
    );
  });

  return <div>{userList}</div>;
}
