import axios from "axios";
import React, { useEffect, useState } from "react";
import CommentFeed from "../comments/CommentFeed";
import CreateComment from "../comments/CreateComment";

export default function FeedCard(props) {
  const [userInput, setUserInput] = useState("");

  let userId = "60d0fe4f5311236168a10a2c";
  let postId = `${props.post.id}`;
  let textInput;

  const logUserComment = (e) => {
    if (e.key == "Enter") {
      let textInput = e.target.value;
      setUserInput(textInput);
    }
  };

  return (
    <div className="container">
      <div className="ui card" style={{ margin: 10 }}>
        <div className="content">
          <div className="right floated meta">
            {props.post.publishDate.slice(0, 10)}
          </div>
          <img className="ui avatar image" src={props.post.owner.picture} />
          {props.post.owner.firstName + " " + props.post.owner.lastName}
        </div>
        <div className="image">
          <img src={props.post.image} />
        </div>
        <div className="content">
          <p className="description" style={{ padding: 2 }}>
            {props.post.text}
          </p>
          <span className="right floated">
            <i className="heart outline like icon"></i>
            {props.post.likes}
          </span>
          <div id="comment-section" className="ui">
            <i className="comment icon"></i>
            {"Comments"}
            <div id="comment-list" className="ui image">
              <CommentFeed post={props.post.id} />
            </div>
          </div>
        </div>
        <div className="extra content">
          <div className="ui large transparent left icon input">
            <i className="heart outline icon"></i>
            <input
              onKeyDown={logUserComment}
              id="comment-input"
              defaultValue={""}
              type="text"
              placeholder="Add Comment..."
            />
            {userInput !== "" ? (
              <CreateComment text={userInput} post={postId} user={userId} />
            ) : (
              console.log("no input found")
            )}
          </div>
        </div>
      </div>
    </div>
  );
}

// There is a "delay" between setUserInput and logging the current UserInput
//
