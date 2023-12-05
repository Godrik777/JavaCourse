package second.office;

public class Office {
    public void workDay(Boss boss, Guard guard, Manager manager, Secretary secretary) {
        boss.bossRage(manager);
        manager.managerRage();
        guard.guardRage();
        secretary.secretaryRage(boss, manager, guard);
    }
}
