import React from "react";
import Button from "react-bootstrap/esm/Button";

export default function Login() {
  return (
    <div className="login-page">
      <h1 className="heading">LOGIN</h1>

      <div className="login-inputs">
        <div className="admin">
          <input type="text" placeholder="admin" />
        </div>
        <br />
        <br />
        <div className="password">
          <input type="password" placeholder="password" />
        </div>
      </div>
      <div className="login-btn">
        <Button variant="dark" size="lg">
          LOGIN
        </Button>
      </div>
    </div>
  );
}
