import React from "react";
import ReactDOM from "react-dom";
import CommentContent from "./Components/CommentContent";

const App = () => {
  return (
    <div>
      <CommentContent />
      <CommentContent />
      <CommentContent />
    </div>
  );
};

ReactDOM.render(<App />, document.querySelector("#root"));
