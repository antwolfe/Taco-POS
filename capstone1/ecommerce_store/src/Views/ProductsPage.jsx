import { useState } from "react";
import HomeBar from "./HomeBar";
import ProductPreview from "./ProductPreview";

export default function ProductsPage({ products }) {
  const [query, setQuery] = useState("");
  const [results, setResults] = useState(products);
  console.log(query);

  const findProduct = (e) => {
    setQuery(e.target.value);

    const allProducts = [...products];
    const newItems = products.filter((item) => {
      if (query == "") {
        return allProducts;
      } else {
        if (item.title.toLowerCase().includes(query.toLowerCase())) {
          console.log(item);
          return item;
        }
      }
    });

    setResults(newItems);
  };

  return (
    <div className="all-products">
      <input
        value={query}
        name="search"
        placeholder="Search..."
        onChange={(e) => findProduct(e)}
      />
      {results.map((product) => {
        return <ProductPreview key={product.id} product={product} />;
      })}

      <HomeBar />
    </div>
  );
}
