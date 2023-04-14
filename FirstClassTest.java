import java.util.Date;

/**
 * エンジニアの属性と挙動
 * @author tarou tanaka
 * @version 1.0
 */
class Engineer {

    String fullName;  // フルネーム
    int    age;       // 年齢
    String belongTo;  // 無所属
    String skill;     // 所属スキル

    //コンストラクタ（インスタンス化する時に必ず呼ばれる特別なメゾット）
    public Engineer(String _fullName, int _age, String _belongTo, String _skill) {
        this.fullName = _fullName;
        this.age      = _age;
        this.belongTo = _belongTo;
        this.skill    = _skill;
    }

    /**
     * 自己紹介を行う
     */
    public void introduce() {
        System.out.println(
            String.format(
                "私の名前は%sです。%sに所属するエンジニアです。現在%s才で、得意言語は%sです。",
                fullName,
                belongTo,
                age,
                skill
                )
        );
    }

    /**
     * 稼働開始する
     */
    public void startWork() {
        Date _d = new Date();
        System.out.println("稼働開始しました。"+ _d);

    }

    /**
     * 稼働終了する
     */
    public void finishWork() {
        Date _d = new Date();
        System.out.println("稼働終了します。" + _d);

    }

    /**
     * スキルを取得
     * @return String 所持スキル文字列
     */
    public String getSkill() {
        if (Objects.isNull(skill) || skill.length() <= 0) {
            return "スキルを持っていません。";
        } else {
            return skill;
        }
    }
}

/**
 * 実行クラス
 */
public class FirstClassTest {
    public static void main(String args[]) {
        Engineer onaga = new Engineer(
            "yasutake onaga", 
            27,
            "アイフル株式会社", 
            "java");
        onaga.introduce();
        onaga.startWork();
        onaga.finishWork();
        System.out.println(onaga.getSkill());



       Engineer tanaka = new Engineer(
           "Tnaka Tarou", 
           27, 
           "XXXX株式会社", 
           "C++, Rust, Haskell");
       tanaka.introduce();
       tanaka.startWork();
       tanaka.finishWork(); 
       tanaka.getSkill();
    }
}