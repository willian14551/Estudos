// TDE 1 de Web Dev
// Coloquei explicações para facilitar

// 1) Funções nomeadas
function somar(a, b) {
  return a + b;
}

function subtrair(a, b) {
  return a - b;
}

function multiplicar(a, b) {
  return a * b;
}

function dividir(a, b) {
  if (b === 0) {
    return "Erro: divisão por zero!";
  }
  return a / b;
}

// 2) Função anônima atribuída a variável
const numeros = [3, 6, 9, 12, 15, 18, 21];

const filtrarPares = function (array) {
  return array.filter(num => num % 2 === 0);
};

// 3) Arrow Function (Pra fazer média)
const calcularMedia = (array) => {
  const soma = array.reduce((total, n) => total + n, 0);
  return (soma / array.length).toFixed(2);
};

// 4) Função de ordem superior
function executarOperacao(a, b, operacao) {
  return operacao(a, b);
}

// Operações Matemáticas
document.getElementById("calcular").addEventListener("click", () => {
  const a = Number(document.getElementById("numA").value);
  const b = Number(document.getElementById("numB").value);

  let saida = `
    <p><b>Soma:</b> ${somar(a, b)}</p>
    <p><b>Subtração:</b> ${subtrair(a, b)}</p>
    <p><b>Multiplicação:</b> ${multiplicar(a, b)}</p>
    <p><b>Divisão:</b> ${dividir(a, b)}</p>
  `;
  document.getElementById("resultado").innerHTML = saida;
});

// Arrays — Filtrar pares
document.getElementById("pares").addEventListener("click", () => {
  const pares = filtrarPares(numeros);
  document.getElementById("resultadoArray").innerHTML =
    `<p><b>Números pares:</b> ${pares.join(", ")}</p>`;
});

// Arrays — Calcular média
document.getElementById("media").addEventListener("click", () => {
  const media = calcularMedia(numeros);
  document.getElementById("resultadoArray").innerHTML =
    `<p><b>Média dos números:</b> ${media}</p>`;
});

// Exemplo com arrow function
document.getElementById("executarCallback").addEventListener("click", () => {
  const resultado = executarOperacao(5, 3, (x, y) => x ** y);
  document.getElementById("resultadoCallback").innerHTML =
    `<p><b>Resultado via callback (potência):</b> ${resultado}</p>`;
});