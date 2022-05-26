import React, { useState, useEffect } from "react";
import axios from "axios";
import CommentCard from "./CommentCard";

export default function CommentFeed() {
  const [comments, setComments] = useState([]);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/comment", {
        headers: {
          "app-id": "628da197616612aa51a596a1",
        },
      })
      .then((res) => {
        setComments(res.data.data);
      });
  }, []);

  console.log(comments);

  let commentsList = comments.map((commentData) => {
    return (
      <CommentCard
        avatar={commentData.owner.picture}
        author={commentData.owner.firstName}
        message={commentData.message}
        commentDate={commentData.publishDate}
      />
    );
  });

  return <div>{commentsList}</div>;
}
