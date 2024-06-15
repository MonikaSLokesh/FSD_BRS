import jwtDecode from 'jwt-decode';

const getTokenExpirationDate = (token) => {
  const decoded = jwtDecode(token);
  if (decoded.exp === undefined) return null;
  const date = new Date(0);
  date.setUTCSeconds(decoded.exp);
  return date;
};

const isTokenExpired = (token) => {
  const expirationDate = getTokenExpirationDate(token);
  return expirationDate < new Date();
};

export { getTokenExpirationDate, isTokenExpired };
