import { Link } from "react-router-dom";
import { FaShoppingCart } from "react-icons/fa";

export default function NavBar() {
  return (
    <div>
      <nav className="navbar">
        <Link to="/">
          <h1>KingBooks</h1>
        </Link>

        <Link to="/cart">
          <FaShoppingCart className="cart-icon" size="30px" alt="cart icon" />
        </Link>
      </nav>
    </div>
  );
}
