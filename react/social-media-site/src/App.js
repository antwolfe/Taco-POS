import React from "react";
import CommentContent from "./components/comments/CommentContent";
import ContentCard from "./components/comments/CommentCard";
import Navbar from "./components/Navbar";
import User from "./components/User";
import UserList from "./components/UserList";

const App = () => {
  return (
    <div className="ui container">
      <h1 className="ui center aligned header">Social Media App</h1>
      <Navbar />
    </div>
  );
};

export default App;
