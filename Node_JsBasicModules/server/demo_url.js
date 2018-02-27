var url=require('url');
//Parse an address with the url.parse() method, and it will return a URL object with each part of the address as properties:
var adr='http://localhost:8080/default.htm?year=2017&month=february';
var q=url.parse(adr,true);


console.log(q.host);
console.log(q.pathname);
console.log(q.search);


var qdata=q.query;//returns an object{year:'2017' , month:'february'}
console.log(qdata.month);
console.log(qdata.year);
