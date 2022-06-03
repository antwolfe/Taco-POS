import { useState } from "react";
import Basket from "../Views/Basket";
import ProductDetail from "../Views/ProductDetail";

export default function OnAdd(props) {
  const [cartItems, setCartItems] = useState([]);

  const { product, item } = props;

  const onAdd = (product) => {
    const exist = cartItems.find((item) => item.id == product.id);
    if (exist) {
      console.log("exists");
      //   setCartItems(
      //     cartItems.map(
      //       (item =
      //         item.id == product.id ? { ...exist, qty: exist.qty + 1 } : item)
      //     )
      //   );
    } else {
      setCartItems([...cartItems, { ...product, qty: 1 }]);
    }
  };
  onAdd();

  return (
    <div>
      <ProductDetail onAdd={onAdd} />
      <Basket cartItems={cartItems} />
    </div>
  );
}
