export class DiffieHellman {
  constructor(p, g) {
    if (!DiffieHellman.isPrime(p)) {
      throw new Error('p must be prime');
    }
    if (!DiffieHellman.isPrime(g)) {
      throw new Error('g must be prime');
    }
    this.p = p;
    this.g = g;
  }

  getPublicKey(privateKey) {
    this.validatePrivateKey(privateKey);
    return this.modPow(this.g, privateKey, this.p);
  }

  getSecret(theirPublicKey, myPrivateKey) {
    this.validatePrivateKey(myPrivateKey);
    return this.modPow(theirPublicKey, myPrivateKey, this.p);
  }

  static getPrivateKey(p) {
    return Math.floor(Math.random() * (p - 2)) + 2;
  }

  validatePrivateKey(privateKey) {
    if (privateKey <= 1) {
      throw new Error('private key must be greater than 1');
    }
    if (privateKey >= this.p) {
      throw new Error('private key must be less than p');
    }
  }

  modPow(base, exponent, modulus) {
    let result = 1;
    base %= modulus;
    while (exponent > 0) {
      if (exponent % 2 === 1) {
        result = (result * base) % modulus;
      }
      exponent = Math.floor(exponent / 2);
      base = (base * base) % modulus;
    }
    return result;
  }

  static isPrime(n) {
    if (n < 2) return false;
    if (n === 2) return true;
    if (n % 2 === 0) return false;
    for (let i = 3; i * i <= n; i += 2) {
      if (n % i === 0) return false;
    }
    return true;
  }
}