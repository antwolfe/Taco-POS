import React from "react";
import Navbar from "./components/Navbar";
import Feed from "./components/Feed";

const App = () => {
  return (
    <div className="ui">
      <h1 className="ui center aligned header">Social Media App</h1>
      <Navbar />
      <div className="ui container">
        <Feed />
      </div>
    </div>
  );
};

export default App;
