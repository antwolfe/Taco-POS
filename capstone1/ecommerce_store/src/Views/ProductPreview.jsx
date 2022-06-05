import Button from "react-bootstrap/Button";
import { FaBook } from "react-icons/fa";
import { useNavigate, Link } from "react-router-dom";

export default function ProductPreview({ product }) {
  const navigate = useNavigate();

  return (
    <div>
      <div className="book-item">
        <img className="book-cover" src={product.cover} alt="book cover" />
        <span>
          <h2 className="book-title">{product.title}</h2>
          <h5 className="book-price">${product.price}</h5>
          <a href="/">
            <Button
              className="btn"
              onClick={(e) => {
                e.preventDefault();
                navigate("/book", { state: { product } });
              }}
            >
              See Details
            </Button>
          </a>
        </span>
      </div>
    </div>
  );
}
