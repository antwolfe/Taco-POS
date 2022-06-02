import React from "react";
import ParseInventory from "./ParseInventory";
import ProductPreview from "./ProductPreview";

export default function ProductsPage(props) {
  console.log(props.books);
  return (
    <div>
      <ParseInventory />
      <ProductPreview />
    </div>
  );
}
