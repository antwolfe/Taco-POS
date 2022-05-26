import React from "react";
import Navbar from "./components/Navbar";
import Feed from "./components/feed/Feed";
import CommentCard from "./components/comments/CommentCard";
import CommentFeed from "./components/comments/CommentFeed";

const App = () => {
  return (
    <div className="ui">
      <h1 className="ui center aligned header">Social Media App</h1>
      <Navbar />
      <div className="ui container">
        <Feed />
        {/* <CommentFeed /> */}
      </div>
    </div>
  );
};

export default App;
