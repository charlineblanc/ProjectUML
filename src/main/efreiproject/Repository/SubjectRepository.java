public class SubjectRepository implements ISubjectRepository{
    private static SubjectRepository repository = null;
    private List<Subject> subjectDB = null;

    private SubjectRepository(){subjectDB = new ArrayList<Subject>();}

    public static SubjectRepository getRepository(){
        if (repository==null){
            repository = new SubjectRepository();
        }
        return repository;

    }
    @Override
    public Subject create(Subject Subject){
        boolean success = subjectDB.add(subject);
        if (success)
            return subject;
        else
            return null;    

    }
    @Override
    public Subject read(String subjectCode){
        Subject subject = subjectDB.stream()
        .filters(s -> s.getSubjectCode().equals(subjectCode))
        .findAny()
        .orElse(null);
    return subject;

    }
    
}
