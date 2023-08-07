class MatrixOperations {
    constructor() {
      this.matrix = [[3], [6], [9], [12], [15]];
      this.resultArray = [];
    }
  
    calculateResultArray() {
      this.resultArray = this.matrix.map(row => row[0] + 3);
    }
  
    displayResult() {
      const resultElement = document.getElementById('result');
      resultElement.textContent = this.resultArray.join(', ');
    }
  }
  
  const matrixOps = new MatrixOperations();
  matrixOps.calculateResultArray();
  matrixOps.displayResult();