import React from "react";
import Button from "react-bootstrap/esm/Button";
import { Navigate } from "react-router-dom";

export default function Login({ setIsLoggedIn, isLoggedIn }) {
  const logIn = () => {
    setIsLoggedIn(true);
  };

  const logOut = () => {
    setIsLoggedIn(false);
  };

  const checkLoggedIn = () => {
    if (!isLoggedIn) {
      return <Navigate to="/" replace={true} />;
    }
    // console.log("next steps");
    // return children;
    return <div>console.log("idk anymore")</div>;
  };

  const onLogIn = (e) => {
    // {
    //   e.preventDefault();

    logIn();
    //   checkLoggedIn();
    // }

    console.log("logged in");
  };

  const onLogOut = () => {
    {
      // e.preventDefault();
      logOut();
      // checkLoggedIn();
    }
    console.log("Logged Out");
  };

  return (
    <form
      onSubmit={(e) => {
        checkLoggedIn();
      }}
    >
      <div className="login-page">
        <h1 className="heading">LOGIN</h1>
        <div className="login-inputs">
          <div className="admin">
            <input type="text" placeholder="admin" name="username" />
          </div>
          <br />
          <br />
          <div className="password">
            <input type="password" placeholder="password" name="password" />
          </div>
        </div>
        <div className="login-btn">
          {isLoggedIn ? (
            <Button type="submit" variant="dark" size="lg" onClick={onLogOut}>
              LOGOUT
            </Button>
          ) : (
            <Button type="submit" variant="dark" size="lg" onClick={onLogIn}>
              LOGIN
            </Button>
          )}
        </div>
      </div>
    </form>
  );
}
