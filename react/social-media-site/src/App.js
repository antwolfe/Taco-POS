import React from "react";
import CommentContent from "./components/CommentContent";
import ContentCard from "./components/ContentCard";
import UserList from "./components/UserList";

const App = () => {
  return (
    <div>
      <h1>Hello!</h1>
      <UserList />
      {/* <ContentCard>
        <CommentContent author="Paul" />
      </ContentCard> */}
    </div>
  );
};

export default App;
