import React from "react";
import { displayComments } from "../comments/CommentFeed";

// TODO: Link comment dropdown to comments
// Link comments to FeedCard through parseComments
//Enter Comment onEnter key or have post button

export default function FeedCard(props) {
  return (
    <div className="container">
      <div className="ui card" style={{ margin: 10 }}>
        <div className="content">
          <div className="right floated meta">
            {props.postDate.slice(0, 10)}
          </div>
          <img className="ui avatar image" src={props.avatar} />
          {props.name}
        </div>
        <div className="image">
          <img src={props.image} />
        </div>
        <div className="content">
          <p className="description" style={{ padding: 2 }}>
            {props.description}
          </p>
          <span className="right floated">
            <i className="heart outline like icon"></i>
            {props.likeCount}
          </span>
          <div className="ui accordion">
            <i
              style={{ cursor: "pointer" }}
              className="comment icon"
              onClick={() => {
                document
                  .querySelector("#show-comments")
                  .classList.toggle("visible")(
                  <p id="show-comments" class="transition hidden">
                    A dog is a type of domesticated animal. Known for its
                    loyalty and faithfulness, it can be found as a welcome guest
                    in many households across the world.
                  </p>
                );
                console.log("hello");
                console.log("goodbye");
              }}
            ></i>
            3 comments
          </div>
          <div className="content"></div>
        </div>
        <div className="extra content">
          <div className="ui large transparent left icon input">
            <i className="heart outline icon"></i>
            <input type="text" placeholder="Add Comment..." />
          </div>
        </div>
      </div>
    </div>
  );
}
