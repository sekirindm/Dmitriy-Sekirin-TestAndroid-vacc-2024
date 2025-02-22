# Декомпозиция задач:
## 1. Настройка проекта
Создать новый проект в Android Studio (10 мин)<br />
Настроить Gradle, добавить необходимые зависимости (Retrofit2, Glide/Picasso, RecyclerView) (20 мин)<br />
Создать структуру проекта (пакеты для моделей, представлений, view models и API) (20 мин)<br />
## 2. Главная страница (список товаров)
Создать макет главной страницы (XML) (50 мин)<br />
Настроить RecyclerView для отображения списка товаров (1 час)<br />
Создать модель данных для товара (40 мин)<br />
Создать адаптер для RecyclerView (1 час)<br />
Настроить Retrofit для получения данных (1.5 часа)<br />
Определить интерфейс API (30 мин)<br />
Создать клиент Retrofit (30 мин)<br />
Реализовать загрузку данных в ViewModel и передачу данных в RecyclerView (40 мин)<br />
Обработка ошибок (20 мин)<br />
## 3. Детальная карточка товара
Создать макет детальной карточки товара (XML) (1 час)<br />
Создать Activity/Fragment для отображения детальной информации о товаре (1 час)<br />
Передача данных из списка товаров на детальный экран (30 мин)<br />
Отобразить детальную информацию о товаре (1 час)<br />

# Реальное время выполненых задач:
## 1. Настройка проекта
Создание нового проекта в Android Studio (5 мин)<br />
Настройка Gradle, добавление необходимых зависимостей (Retrofit2, Picasso, koin, coroutines и тд) (10 мин)<br />
Создание структуры проектов (пакеты для моделей, представлений, view models и API) (20 мин)<br />
## 2. Главная страница (список товаров)
Создание макета главной страницы (XML) (30 мин)<br />
Настройка RecyclerView для отображения списка товаров (20 мин)<br />
Создание модели данных для товара (40 мин)<br />
Создание адаптера для RecyclerView (1.5 часа)<br />
Настройка Retrofit для получения данных (30 часа)<br />
Определение интерфейса API (10 мин)<br />
Создание клиента Retrofit (10 мин)<br />
Реализация загрузки данных в ViewModel и передача данных в RecyclerView (1 час)<br />
Обработка ошибок (5 мин)<br />
## 3. Детальная карточка товара
Создание макета детальной карточки товара (XML) (30 мин)<br />
Создание Fragment для отображения детальной информации о товаре (30 мин)<br />
Передача данных из списка товаров на детальный экран (10 мин)<br />
Отобразить детальную информацию о товаре (10 мин)<br />


# Дополнительно

### Я решил использовать Koin вместо Dagger2, потому что Dagger2 неоптимален для маленьких проектов. К тому же использование даггера в связске с ViewModel очень проблематичное, что не скажешь про Koin(я програмиист, я должен искать опитмальные варианты)
