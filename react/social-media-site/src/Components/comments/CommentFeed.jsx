import React, { useState, useEffect } from "react";
import axios from "axios";
import CommentCard from "./CommentCard";
const API_KEY = "628da197616612aa51a596a1";

// props from FeedCard
export default function CommentFeed(props) {
  const [comments, setComments] = useState([]);
  const [isLoading, setIsLoading] = useState(true);

  useEffect(() => {
    axios
      .get(`https://dummyapi.io/data/v1/post/${props.post}/comment`, {
        headers: {
          "app-id": API_KEY,
        },
      })
      .then((res) => {
        setComments(res.data.data);
        setIsLoading(false);
      });
  }, []);

  let commentsList = comments.map((commentData, i) => {
    return (
      <CommentCard
        key={i}
        avatar={commentData.owner.picture}
        author={commentData.owner.firstName}
        message={commentData.message}
        commentDate={commentData.publishDate}
        commentNumber={commentData.length}
      />
    );
  });

  if (!isLoading) {
    return <div>{commentsList}</div>;
  }
}
