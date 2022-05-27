import axios from "axios";
import React, { useEffect, useState } from "react";
import CommentFeed from "../comments/CommentFeed";

export default function FeedCard(props) {
  const [userInput, setUserInput] = useState("");

  const userId = `${props.post.owner.id}`;
  const postId = `${props.post.id}`;

  // async function createComment(userInput) {
  //   const res = await axios.post("https://dummyapi.io/data/v1/comment/create", {
  //     headers: {
  //       "app-id": "628da197616612aa51a596a1",
  //     },
  //     body: {
  //       message: userInput,
  //       owner: userId,
  //       post: postId,
  //     },
  //   });
  //   console.log(res);
  // }

  const createComment = async () => {
    const res = await axios.post("https://dummyapi.io/data/v1/comment/create", {
      body: {
        message: userInput,
        owner: userId,
        post: postId,
      },
      headers: {
        "app-id": "628da197616612aa51a596a1",
      },
    });
    console.log(res);
    props.newRequest(res.data);
    setUserInput("");
  };

  const handleOnClick = (e) => {
    const commentSection = document.querySelector("#comment-list");
    // console.log("hello");
  };

  const logUserComment = (e) => {
    if (e.key === "Enter") {
      console.log(e.target.value);
      setUserInput(e.target.value);
      createComment();
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
            <i
              style={{ cursor: "pointer" }}
              className="comment icon"
              onClick={handleOnClick}
            ></i>
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
              id="comment-input"
              defaultValue={userInput}
              type="text"
              // onChange={getInputValue}
              placeholder="Add Comment..."
              onKeyDown={logUserComment}
            />
          </div>
        </div>
      </div>
    </div>
  );
}
