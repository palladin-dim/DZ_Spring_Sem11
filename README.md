### Фреймворк Spring (семинары)
## Урок 11. Spring Actuator. Настройка мониторинга с Prometheus и Grafana.
Задание: Используйте Spring Actuator для отслеживания метрик вашего приложения. Настройте визуализацию этих метрик с использованием Prometheus и Grafana.

Три счетчика находятся в TaskController
- add_task_counter(количество добавленных задач);
- timer_update_task(время обновления задачи);
- all_task_list(количество запросов на все задачи);

В папке _resources_project_ находятся скриншоты и prometheus.yml