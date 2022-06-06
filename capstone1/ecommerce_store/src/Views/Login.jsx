import React, { Children } from "react";
import Button from "react-bootstrap/esm/Button";
import { Route, useNavigate } from "react-router-dom";
import InventoryChart from "./InventoryChart";

export default function Login({ setIsLoggedIn, isLoggedIn, children }) {
  let navigate = useNavigate();

  console.log(isLoggedIn);
  const logIn = () => {
    setIsLoggedIn(true);
  };

  const logOut = () => {
    setIsLoggedIn(false);
  };

  const onLogIn = (e) => {
    console.log("logging in");
  };

  const onLogOut = () => {
    console.log("Logging Out");
    logOut();
  };

  const loginValid = () => {
    const userUname = document.forms[0][0].value;
    const userPass = document.forms[0][1].value;

    const loginUname = "admin";
    const loginPass = "pass";

    if (userPass !== loginPass || userUname !== loginUname) {
      console.log("wrong info");
      return false;
    } else if (userPass == loginPass && userUname == loginUname) {
      logIn();
      navigate("/admin", { replace: true });
      // return true;
    }
  };

  const onSubmit = (e) => {
    e.preventDefault();
    if (!loginValid()) {
      console.log("Incorrect Login Info");
    }
  };

  return (
    <form
      onSubmit={(e) => {
        onSubmit(e);
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
