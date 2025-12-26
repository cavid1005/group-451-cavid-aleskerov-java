
// 6
let grade = prompt("Буква оценки:");
switch (grade) {
  case "A": console.log("Отлично"); break;
  case "B": console.log("Хорошо"); break;
  case "C": console.log("Средне"); break;
  case "D": console.log("Плохо"); break;
  case "F": console.log("Не сдал"); break;
}

// 7
let a = +prompt("Первое число:");
let b = +prompt("Второе число:");
console.log(a > b ? "Первое больше" : "Второе не меньше");

// 8
let h = +prompt("Часы 0-23:");
if (h >= 6 && h <= 11) console.log("Утро");
else if (h <= 17) console.log("День");
else if (h <= 22) console.log("Вечер");
else console.log("Ночь");

// 9
let m = +prompt("Месяц 1-12:");
switch (m) {
  case 12: case 1: case 2: console.log("Зима"); break;
  case 3: case 4: case 5: console.log("Весна"); break;
  case 6: case 7: case 8: console.log("Лето"); break;
  case 9: case 10: case 11: console.log("Осень"); break;
}

// 12
let score = +prompt("Балл 0-100:");
if (score >= 90) console.log("5");
else if (score >= 75) console.log("4");
else if (score >= 50) console.log("3");
else console.log("2");

// 13
let light = prompt("Цвет светофора:");
switch (light) {
  case "красный": console.log("Стой"); break;
  case "жёлтый": console.log("Жди"); break;
  case "зелёный": console.log("Можно идти"); break;
}

// 14
let ag = +prompt("Возраст:");
if (ag < 7) console.log("Детский сад");
else if (ag <= 17) console.log("Школа");
else console.log("Взрослый");

// 15
let q = +prompt("Четверть 1-4:");
switch (q) {
  case 1: console.log("Первая"); break;
  case 2: console.log("Вторая"); break;
  case 3: console.log("Третья"); break;
  case 4: console.log("Четвёртая"); break;
}

// 16
let height = +prompt("Рост:");
if (height < 150) console.log("Низкий");
else if (height <= 180) console.log("Средний");
else console.log("Высокий");

// 17
let points = +prompt("Очки:");
console.log(points > 100 ? "Победитель!" : "Попробуй ещё");

// 18
let op = prompt("Операция:");
switch (op) {
  case "+": console.log("Сложение"); break;
  case "-": console.log("Вычитание"); break;
  case "*": console.log("Умножение"); break;
  case "/": console.log("Деление"); break;
}

// 19
let day = prompt("День недели:");
switch (day) {
  case "суббота":
  case "воскресенье": console.log("Выходной"); break;
  default: console.log("Рабочий");
}

// 22
let water = +prompt("Температура воды:");
if (water <= 0) console.log("Лёд");
else if (water < 100) console.log("Вода");
else console.log("Пар");

// 23
let code = +prompt("Код ошибки:");
switch (code) {
  case 404: console.log("Страница не найдена"); break;
  case 500: console.log("Ошибка сервера"); break;
  case 200: console.log("Успешно"); break;
}

// 25
let beh = +prompt("Поведение:");
console.log(beh < 4 ? "Поговорим с родителями" : "Молодец");

// 26
let planet = +prompt("Планета 1-8:");
switch (planet) {
  case 1: console.log("Меркурий"); break;
  case 2: console.log("Венера"); break;
  case 3: console.log("Земля"); break;
  case 4: console.log("Марс"); break;
  case 5: console.log("Юпитер"); break;
  case 6: console.log("Сатурн"); break;
  case 7: console.log("Уран"); break;
  case 8: console.log("Нептун"); break;
}

// 27
let wind = +prompt("Скорость ветра:");
if (wind > 50) console.log("Ураган");
else if (wind >= 30) console.log("Сильный ветер");
else console.log("Спокойно");

//31
let players = +prompt("Количество игроков:");
if (players == 2) console.log("Дуэль");
else if (players >= 3 && players <= 4) console.log("Малая команда");
else console.log("Большая команда");

//32
let battery = +prompt("Заряд батареи 0-100:");
console.log(battery < 20 ? "Заряди телефон!" : "Всё ок");

//33
let floor = +prompt("Номер этажа 1-20:");
console.log(floor > 10 ? "Высокий этаж" : "Низкий");

//34
let subject = prompt("Любимый предмет:");
switch (subject) {
case "математика": console.log("Царица наук 👑"); break;
case "русский": console.log("Грамотность — сила ✍️"); break;
case "физкультура": console.log("Спорт — это жизнь 💪"); break;
case "информатика": console.log("Будущий программист 😎"); break;
default: console.log("Интересный предмет!");
}

//35
let dice = +prompt("Бросок кубика 1-6:");
switch (dice) {
case 1: console.log("Пропусти ход"); break;
case 2: console.log("Сделай шаг назад"); break;
case 3: console.log("Ничего не происходит"); break;
case 4: console.log("Сделай шаг вперёд"); break;
case 5: console.log("Ещё один ход"); break;
case 6: console.log("Бонус!"); break;
}

//36
let month = +prompt("Месяц 1-12:");
switch (month) {
case 1: console.log("Козерог"); break;
case 2: console.log("Водолей"); break;
case 3: console.log("Рыбы"); break;
case 4: console.log("Овен"); break;
case 5: console.log("Телец"); break;
case 6: console.log("Близнецы"); break;
case 7: console.log("Рак"); break;
case 8: console.log("Лев"); break;
case 9: console.log("Дева"); break;
case 10: console.log("Весы"); break;
case 11: console.log("Скорпион"); break;
case 12: console.log("Стрелец"); break;
}

//37
let candies = +prompt("Количество конфет:");
console.log(candies > 10 ? "Слишком много сладкого!" : "Можно съесть");

//38
let country = +prompt("Код страны:");
switch (country) {
case 7: console.log("Москва"); break;
case 1: console.log("Вашингтон"); break;
case 44: console.log("Лондон"); break;
default: console.log("Неизвестная страна");
}

//39
let answer = prompt("Ответ (да/нет):");
if (answer == "да") console.log("Согласен");
else if (answer == "нет") console.log("Не согласен");
else console.log("Не понял");

//40
let minutes = +prompt("Минут до конца урока:");
console.log(minutes < 5 ? "Скоро звонок!" : "Ещё долго");

//41
let transport = prompt("Транспорт:");
switch (transport) {
case "автобус": console.log("Средняя скорость 40 км/ч"); break;
case "метро": console.log("Средняя скорость 60 км/ч"); break;
case "велосипед": console.log("Средняя скорость 15 км/ч"); break;
}

//42
let mood = +prompt("Настроение 1-5:");
switch (mood) {
case 1: console.log("😢"); break;
case 2: console.log("😕"); break;
case 3: console.log("😐"); break;
case 4: console.log("🙂"); break;
case 5: console.log("😄"); break;
}

//43
let mistakes = +prompt("Ошибки в диктанте:");
if (mistakes == 0) console.log("Отлично!");
else if (mistakes <= 3) console.log("Хорошо");
else console.log("Надо потренироваться");

//44
let animal = +prompt("Код животного 1-3:");
switch (animal) {
case 1: console.log("Мяу"); break;
case 2: console.log("Гав"); break;
case 3: console.log("Чирик"); break;
}