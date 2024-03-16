@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Дополнительные методы доступа к данным, если необходимо
}