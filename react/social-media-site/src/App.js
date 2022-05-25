import React from "react";
import CommentContent from "./components/comments/CommentContent";
import ContentCard from "./components/comments/CommentCard";
import Navbar from "./components/Navbar";
import User from "./components/users/User";
import UserList from "./components/users/UserList";
import Feed from "./components/Feed";

const App = () => {
  return (
    <div className="ui container">
      <h1 className="ui center aligned header">Social Media App</h1>
      <Navbar />
      <Feed />
    </div>
  );
};

export default App;
