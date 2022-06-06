import { useState } from "react";
import Search from "../Components/Search";
import HomeBar from "./HomeBar";
import ProductPreview from "./ProductPreview";

export default function ProductsPage({ products, setItems }) {
  const [query, setQuery] = useState("");
  const [results, setResults] = useState(products);
  console.log(query);

  const findProduct = (e) => {
    // setQuery(query);
    setQuery(e.target.value);
    console.log(query);
    //create copy of all products
    const allProducts = [...products];
    // if (query == "") {
    //   setItems(allProducts);
    // }
    const newItems = products.filter((item) => {
      console.log(item.title);
      console.log(query);
      if (query == "") {
        return allProducts; //(allProducts);
      } else {
        //any item name that matches query
        console.log();
        return item.title.toLowerCase().includes(query.toLowerCase());
        // setItems(newItems);
      }
      setResults(newItems);
    });
  };

  return (
    <div className="all-products">
      <input
        value={query}
        name="search"
        placeholder="Search..."
        onChange={(e) => findProduct(e)}
      />
      {products.map((product) => {
        return <ProductPreview key={product.id} product={product} />;
      })}

      <HomeBar />
    </div>
  );
}
