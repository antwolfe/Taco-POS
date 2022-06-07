import { useState } from "react";
import Button from "react-bootstrap/esm/Button";

export default function InventoryItem({
  product,
  deleteFromInventory,
  setItems,
}) {
  const handleDelete = (e, product) => {
    e.preventDefault();
    deleteFromInventory(product);
  };

  return (
    <div>
      <div className="inventory-item">
        <div className="preview-item">
          <img className="book-cover" src={product.cover} alt="book cover" />
          <span>
            <h2 className="book-title">Title: {product.title}</h2>
            <h5 className="book-id">ID#: {product.id}</h5>
            <h5 className="book-year">In Stock? {product.inventory}</h5>
            <h5 className="book-price">Selling Price: ${product.price}</h5>
            <h5 className="book-price">ISBN: {product.price}</h5>

            <a href="/">
              <div className="counter">
                <Button
                  variant="danger"
                  onClick={(e) => handleDelete(e, product)}
                >
                  DELETE ITEM
                </Button>

                <br />
              </div>
            </a>
          </span>
        </div>
      </div>
    </div>
  );
}
