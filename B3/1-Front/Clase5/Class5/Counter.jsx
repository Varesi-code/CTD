import React from "react";
import User from "./User";

const Counter = ({ data }) => {
  return (
    <div>
      {data.map((names) => (
        <User key={names} name={names} />
      ))}
    </div>
  );
};

export default Counter;
