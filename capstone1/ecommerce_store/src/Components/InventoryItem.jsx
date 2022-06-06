import { useState } from "react";
import Button from "react-bootstrap/esm/Button";

export default function InventoryItem({
  product,
  inventoryQty,
  setInventoryQty,
  setItems,
}) {
  //   console.log(product.inventory);
  const [productInventory, setProductInventory] = useState();
  //inventoryQty[dataplace][bookID]

  const showCurrQty = (product) => {
    for (let i in inventoryQty) {
      if (product.qty == inventoryQty[i + 1]) {
        console.log(product);
      }
    }
  };

  const increase = (product, e) => {
    e.preventDefault();
    setItems(product.inventory + 1);

    console.log("not enough product~");
  };

  const decrease = () => {
    if (inventoryQty > 0) {
      setInventoryQty(inventoryQty - 1);
    } else {
      //   onDelete(product);
      console.log("removing item...");
    }
  };
  return (
    <div>
      <div className="inventory-item">
        <div className="preview-item">
          <img className="book-cover" src={product.cover} alt="book cover" />
          <span>
            <h2 className="book-title">{product.title}</h2>
            <h5 className="book-price">${product.price}</h5>
            <a href="/">
              <div className="counter">
                <Button onClick={decrease}>-</Button>
                <input
                  className="qty-num"
                  type="number"
                  value={product.inventory}
                  onChange={() => {
                    return product.inventory;
                  }}
                  style={{ width: "35px" }}
                />
                <Button onClick={console.log("hello")}>+</Button>
              </div>
            </a>
          </span>
        </div>
      </div>
    </div>
  );
}
