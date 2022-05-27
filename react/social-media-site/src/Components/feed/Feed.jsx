import axios from "axios";
import React, { useState, useEffect } from "react";
import FeedCard from "./FeedCard";

export default function Feed() {
  const [posts, setPosts] = useState([]);

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

  let postList = posts.map((post) => {
    return <FeedCard post={post} key={post.id} />;
  });

  return <div className="container">{postList}</div>;
}
