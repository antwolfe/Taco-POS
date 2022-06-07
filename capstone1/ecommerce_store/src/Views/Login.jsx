import Button from "react-bootstrap/esm/Button";
import { useNavigate } from "react-router-dom";

export default function Login({ setIsLoggedIn, isLoggedIn }) {
  let navigate = useNavigate();

  const logIn = () => {
    setIsLoggedIn(true);
  };

  const logOut = () => {
    setIsLoggedIn(false);
  };

  const loginValid = () => {
    const userUname = document.forms[0][0].value;
    const userPass = document.forms[0][1].value;

    const loginUname = "admin";
    const loginPass = "pass";

    if (userPass !== loginPass || userUname !== loginUname) {
      alert("Wrong Username or Password. Please try again.");
      return false;
    } else if (userPass == loginPass && userUname == loginUname) {
      logIn();
      navigate("/admin", { replace: true });
    }
  };

  const onSubmit = (e) => {
    e.preventDefault();
    if (!loginValid()) {
      logOut();
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
            <Button type="submit" variant="dark" size="lg" onClick={logOut}>
              LOGOUT
            </Button>
          ) : (
            <Button type="submit" variant="dark" size="lg" onClick={logIn}>
              LOGIN
            </Button>
          )}
        </div>
      </div>
    </form>
  );
}
