import React from "react";
import axios from "axios";
const API_KEY = "628da197616612aa51a596a1";

export default function CreateComment(props) {
  let userInput = props.input;
  let userId = props.user;
  let postId = props.post;

  // console.log(userInput);
  console.log(userId);
  console.log(postId);

  const createComment = async () => {
    const res = await axios.post("https://dummyapi.io/data/v1/comment/create", {
      body: {
        message: userInput,
        owner: userId,
        post: postId,
      },
      headers: {
        "app-id": API_KEY,
      },
    });
    console.log(res);
    // props.newRequest(res.data);
  };

  createComment();

  return <div>CreateComment</div>;
}
