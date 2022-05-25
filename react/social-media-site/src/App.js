import React from "react";
import CommentContent from "./Components/CommentContent";
import ContentCard from "./Components/ContentCard";
const axios = require("axios");

const App = () => {
  // Get info from API
  axios
    .get("https://dummyapi.io/data/v1/user", {
      headers: {
        "app-id": "628da197616612aa51a596a1",
      },
    })
    .then((res) => {
      console.log(res.data.data[0].firstName);
    })
    .catch((err) => {
      console.log("failure");
    });

  return (
    <div>
      <h1>Hello, You've Got This!</h1>
      <ContentCard>
        <CommentContent />
      </ContentCard>
    </div>
  );
};

export default App;
