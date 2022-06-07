import CloseButton from "react-bootstrap/esm/CloseButton";

import ModifyQty from "./ModifyQty";

export default function CartItem(props) {
  const { product, onDelete, cartItems, items, setItems } = props;

  return (
    <div>
      <div className="cart-item">
        <CloseButton
          variant="white"
          onClick={() => onDelete(product)}
          className="close-btn"
        />
        <div className="cart-content">
          <img className="book-cover" src={product.cover} alt="book cover" />
          <div className="cart-text">
            <h2 className="book-title">{product.title}</h2>
            <h5> {product.price} </h5>
            <h5> QTY: {product.inventory} </h5>
            <ModifyQty
              maxQty={product.inventory}
              onDelete={onDelete}
              product={product}
              cartItems={cartItems}
              items={items}
              setItems={setItems}
            />
          </div>
        </div>
      </div>
    </div>
  );
}
