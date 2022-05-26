import axios from "axios";
import React, { useState, useEffect } from "react";
import FeedCard from "./FeedCard";
import CommentFeed from "../comments/CommentFeed";
import CommentCard from "../comments/CommentCard";

export default function Feed() {
  const [posts, setPosts] = useState([]);
  // const [comments, setComments] = useState(Comment);

  useEffect(() => {
    axios
      .get("https://dummyapi.io/data/v1/post", {
        headers: {
          "app-id": "628da197616612aa51a596a1",
        },
      })
      .then((res) => {
        setPosts(res.data.data);
      });
  }, []);

  let comment = (
    <CommentCard>
      <FeedCard />
    </CommentCard>
  );

  let postList = posts.map((post) => {
    return (
      <FeedCard
        avatar={post.owner.picture}
        name={post.owner.firstName + " " + post.owner.lastName}
        image={post.image}
        description={post.text}
        likeCount={post.likes}
        postDate={post.publishDate}
        comment={comment.children}
      />
    );
  });

  console.log(postList);
  return <div className="container">{postList}</div>;
}
