import React from "react";

const ContentCard = (props) => {
  return (
    <div class="ui raised card">
      <div class="content">{props.children}</div>
    </div>
  );
};

export default ContentCard;
