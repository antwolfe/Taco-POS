import React from "react";
import axios from "axios";
const API_KEY = "628da197616612aa51a596a1";

export default function CreateComment(props) {
  console.log(props);

  let userInput = props.text;
  let userId = props.user;
  let postId = props.post;

  const postComment = async () => {
    try {
      let sendComment = {
        message: userInput,
        owner: userId,
        post: postId,
      };

      const res = await axios.post(
        "https://dummyapi.io/data/v1/comment/create/",
        {
          headers: {
            "app-id": "6294f8ae73e985f14b5b456d",
            "Content-type": "text/plain",
          },
          body: sendComment,
        }
      );

      const newPost = await res;
      console.log(newPost);
    } catch (error) {
      console.log(error);
    }
  };

  postComment();

  return <div></div>;
}
